# SEL_week4

## پرسش ۱:

الگوهای Creational Patterns: این الگوها در مورد ایجاد کلاس‌ها و شی‌ها هستن. اونا فرایند ساخت شی‌ رو انتزاعی کردن تا سیستم بتونه مستقل از نحوه ایجاد، ترکیب و نمایش شی‌هاش باشه. مثل Factory Method, Abstract Factory, Builder, Prototype, و Singleton.

الگوهای Structural Patterns: این الگوها در مورد چگونگی ترکیب کلاس‌ها و شی‌ها برای تشکیل ساختارهای بزرگتر هستن. اونا با شناسایی روش‌های ساده برای برقراری روابط بین موجودیت‌ها، طراحی رو آسون‌تر می‌کنن. مثل Adapter, Bridge, Composite, Decorator, Facade, Flyweight, و Proxy.

الگوهای Behavioral Patterns: این الگوها به الگوریتم‌ها و واگذاری مسئولیت‌ها بین شی‌ها مربوط می‌شن. اونا نه تنها الگوهای کلاس‌ها و شی‌ها رو توضیح می‌دن بلکه الگوهای ارتباط بین اون‌ها رو هم نشون می‌دن. مثل Strategy, Observer, Command, Iterator, Mediator, Memento, State, و Visitor.

## پرسش ۲:

Strategy Pattern (Behavioral): برای انتخاب دینامیک روش تحویل محموله استفاده شده.
State Pattern (Behavioral): برای مدیریت وضعیت بسته (در حال حمل یا تحویل داده شده) استفاده شده.


## پرسش ۳:
با توجه به اینکه در هر اجرا فقط یک بسته وجود داره، Singleton Pattern مناسبه. این الگو اطمینان می‌ده که یک کلاس فقط یک نمونه داشته باشه و یک نقطه دسترسی به اون فراهم می‌کنه. در زمینه آزمایش:

تحقق: بسته حمل شده به عنوان یک کلاس singleton نمایش داده می‌شه. این اطمینان می‌ده که بدون توجه به تعداد دفعات یا مکان استفاده از بسته در کد، همیشه فقط یک نمونه از اون وجود داره.
دلیل انتخاب: چون سیستم فقط با یک بسته در یک زمان کار می‌کنه، استفاده از الگوی Singleton از ایجاد اشتباهی نمونه‌های متعدد بسته جلوگیری می‌کنه و باعث حفظ یکپارچگی و جلوگیری از تضادهای احتمالی یا خطاها می‌شه.


## پرسش ۴:

Single Responsibility Principle (SRP): تا حدودی تحقق یافته. Singleton اطمینان می‌ده که یک مسئولیت منحصر به فرد برای ایجاد و مدیریت نمونه خودش داشته باشه، ولی ممکنه باعث بشه که یک کلاس بیش از یک دلیل برای تغییر داشته باشه اگر علاوه بر مدیریت نمونه، مسئولیت‌های منطق کسب و کار رو هم داشته باشه.

Open/Closed Principle (OCP): خیلی پشتیبانی نمی‌شه. Singleton‌ها سخت قابل subclassing هستن و افزایش رفتارشون بدون تغییر دشواره. این الگو اغلب منجر به کدی می‌شه که برای توسعه بسته است.

Liskov Substitution Principle (LSP): خوب پشتیبانی نمی‌شه. نمونه‌های Singleton معمولاً به راحتی نمی‌تونن با نمونه‌ای از یک subclass جایگزین شن، چون این الگو اغلب به روش static برای دسترسی به نمونه تکیه داره.

Interface Segregation Principle (ISP): مستقیماً مرتبط نیست. الگوی Singleton معمولاً








