# Singleton Pattern: Creational Design Pattern

بيضمن ان الكلاس يكون عنده Instance(Object) واحد بس في البرنامج كله واقدر اوصله من اي مكان. مهما حاولت اعمل أوبجكت جديد من الكلاس ده، هلاقي نفس الأوبجكت القديم بيرجع.

---
 


أول طلب ─ بيتعمل أوبجكت جديد ✓
  ↓
تاني طلب ─ نفس الأوبجكت بيرجع
  ↓
تالت طلب ─ نفس الأوبجكت برضو

---




مشكلة Singleton:

مخالفة المبادئ: Singleton يحل مشكلتين في نفس الوقت وده بيخالف Single Responsibility Principle.

إنشاء كائنات متعددة: الـ constructor العادي بيعمل أوبجكت جديد في كل مرة، وده مش مناسب لو بتشتغل مع shared resource زي database أو ملف.

المتغيرات العامة: الـ Global Variables سهلة الوصول بس أي كود ممكن يغير قيمتها.

---


الحل:

Singleton بيوفر instance واحد فقط مع نقطة وصول موحّدة من أي مكان في التطبيق من خلال:

Default Constructor (Private): امنع أي حد برا الكلاس يعمل أوبجكت بالـ new العادي.

Static Creation Method: بتعمل أوبجكت جديد أول مرة وتحفظه، وتاني مرة بترجع المحفوظ.

---

Real-World Analogy :

شبكة الـ Wi-Fi: الـ (Wi-Fi) في البيت مثال على Singleton، لأنه جهاز واحد فقط كل الأجهزة بتستخدمه للوصول للإنترنت.

الحكومة: في كل بلد حكومة واحدة بس — اسمها "حكومة مصر" — الأشخاص بيتغيروا بس الحكومة واحدة.

الربط البرمجي: الـ Singleton instance واحدة بس — بتوصلها بـ getInstance() — الكود بيتغير بس الـ instance واحدة.


---



Structure (الهيكل الرئيسي):

Private Static Field: بيحفظ الـ instance الوحيدة — static عشان تكون على مستوى الكلاس — private عشان محدش يوصلها.

Private Constructor: محدش يقدر يعمل new Singleton() من برا الكلاس.

getInstance() — الباب الوحيد: public + static — بقدر استدعيها من أي مكان من غير ما اعمل أوبجكت — هي اللي بتتحكم في الـ instance.

---




UML Diagram:

┌──────────────────────────────┐
│         Singleton            │
├──────────────────────────────┤
│ - static instance: Singleton │
├──────────────────────────────┤
│ - Singleton()                │
│ + static getInstance()       │
└──────────────────────────────┘
الـ UML Diagram بيوضح الـ Singleton Class نفسه وبيتكون من:

قسم الـ Fields: فيه instance وهي private وstatic.

قسم الـ Constructor: وهو private — محدش يقدر يكاله من برا.

قسم الـ Methods: فيه getInstance() وهي public وstatic — دي الباب الوحيد.

---



Step-by-step execution flow :

البرنامج يبدأ.

أي كلاس ينادي getInstance().

يتم فحص هل الـ instance موجود؟

لو مش موجود ← يتم إنشاؤه مرة واحدة.

يتم تخزينه في static variable.

يتم إرجاع نفس الـ instance دائمًا.

أي طلبات بعد كده تستخدم نفس الكائن.

---


Participants / Roles (الأدوار):

Singleton Class: مسؤول عن إنشاء instance واحد فقط.

Static Instance: يخزن الكائن الوحيد.

getInstance(): نقطة الوصول الوحيدة للكائن.

Client: أي كلاس يستخدم الـ Singleton.

---

استخدام Singleton :

بستخدم ال Singleton لما اكون محتاج instance واحدة مشتركة بين كل أجزاء البرنامج زي database أو config أو logger.

لما محتاج تحكم أقوى في الـ global variables وتحميها من التغيير.


---


خطوات التنفيذ:

Private Static Field

Public Static Creation Method

طبق Lazy Initialization: اعمل الأوبجكت بس لما حد يطلبه أول مرة، مش من أول ما البرنامج يشتغل.

اعمل الـ Constructor Private

غير كل الـ Client Code: استبدل كل new Singleton() بـ Singleton.getInstance().

---



المميزات والعيوب:

المميزات:

instance واحدة مضمونة دايمًا.

Global Access Point واضح وآمن.

Lazy Initialization — بيتعمل لما حد يطلبه بس.

 العيوب:

بيخالف Single Responsibility Principle.

ممكن يخبي Design ردئ في الكود.

محتاج Thread Lock في الـ Multithreading.

صعب جداً في الـ Unit Testing.

---


علاقته بباترنز تانية:

Facade: ممكن يتحول لـ Singleton لأن في الغالب محتاج منه واحد بس في البرنامج كله.

Flyweight: شبيه بس مختلف — Flyweight عنده instances كتير بـ states مختلفة وهو immutable، الـ Singleton واحدة وممكن تتغير.

Abstract Factory / Builder / Prototype: الثلاثة ممكن يتنفذوا كـ Singleton لأن في الغالب محتاج واحد بس منهم.