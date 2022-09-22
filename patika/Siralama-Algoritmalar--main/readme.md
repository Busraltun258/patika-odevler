# Merge sort sıralması 
 www.patika.dev 
- [16,21,11,8,12,22] -> Dizisinin sıralama aşamaları
1. Dizi ortadan iki diziye ayrılır

* 1. dizi=[16,21,11]

* 2. dizi=[8,12,22]

2. [16,21,11] dizisi tek parça kalana kadar ayrılmaya devam eder.
* [16,21] ve [11] şeklinde
* [16,21] dizisi tekrar ayrılır.
* Sol taraf [16],[21],[11] şeklini alır.

* 3.[8,12,22] dizisi tek parça kalana kadar ayrılmaya devam eder.
* [8,12] ve [22]  şeklinde
* [8,12] dizisi tekrar ayrılır.
* Sağ taraf [8],[12],[22] şeklini alır.
4. Şimdi sıralayarak birleştirme kısmına geçiyoruz.
* 1. dizi ile başlıyoruz. [16],[21],[11]
* 16 ve 21 karşılaştırılır. 16 başa yazılır
* [16,21] ve [11] olur.
* Daha sonra 16 11 ile 21 11 ile karşılaştırılarak 11 başa geçiyor ve sol dizi [11,16,21] şeklini alıyor.
* Aynı işlem sağ taraf için de uygulanıyor.

* [8],[12],[22] dizisinde 8 ve 12 karşılaştırılır. 8 küçük olduğu için başa geçer. [8,12] ve [22] dizileri oluşur.
* Daha sonra 8 22 ile 12 22 ile karşılaşırılır ve sayılar uygun yerlerini alarak [8,12,22] sağ dizisi oluşturulur.
* [11,16,21] ve [8,12,22] dizileri soldan sağa karşılaştırılarak tek bir sıralı dizi elde edilir.
*Sonuç = [8,11,12,21,22] dizisi oluşur.
## Big O karmaşıklığı: (nlgn)'dir.