# Kilometre Başına Ücret Hesaplama Programı

Bu basit Java programı, girilen kilometre değerine göre ödenecek toplam tutarı hesaplar. Program, her kilometre başına 20 TL ücret hesaplayarak toplam tutarı kullanıcıya gösterir.

## Özellikler

- Kullanıcıdan kilometre bilgisi alır
- Kilometre başına sabit ücret (20 TL) üzerinden hesaplama yapar
- Hesaplanan toplam tutarı TL cinsinden gösterir

## Gereksinimler

- Java JDK 8 veya üzeri sürüm
- Herhangi bir Java IDE'si (Eclipse, IntelliJ IDEA, VS Code vb.)

## Kurulum

1. Projeyi bilgisayarınıza indirin:
```bash
git clone https://github.com/kullaniciadi/TutarHesaplama.git
```

2. Proje klasörüne gidin:
```bash
cd TutarHesaplama
```

3. Java dosyasını derleyin:
```bash
javac OdenecekTutarHesaplama.java
```

4. Programı çalıştırın:
```bash
java OdenecekTutarHesaplama
```

## Kullanım

1. Program çalıştığında kilometre değerini girin
2. Program otomatik olarak toplam tutarı hesaplayacak ve ekrana yazdıracaktır

Örnek çalıştırma:
```
Kilometre miktarını girin: 100
Toplam ödenecek tutar: 2000.0 TL
```

## Hesaplama Formülü

Program aşağıdaki formülü kullanır:
```
Toplam Tutar = Kilometre × 20 TL
```

## Planlanan Geliştirmeler

- [ ] Farklı araç tipleri için farklı kilometre ücretleri
- [ ] KDV hesaplama özelliği
- [ ] Minimum ücret kontrolü
- [ ] Grafik kullanıcı arayüzü
- [ ] Mesafe için maksimum limit kontrolü

## Katkıda Bulunma

1. Bu projeyi fork edin
2. Yeni bir branch oluşturun (`git checkout -b yeni-ozellik`)
3. Değişikliklerinizi commit edin (`git commit -m 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin yeni-ozellik`)
5. Yeni bir Pull Request oluşturun

## Notlar

- Program negatif kilometre değerlerini kontrol etmemektedir
- Ondalıklı kilometre girişi yapılabilir
- Program virgül yerine nokta kullanılarak sayı girilmesini bekler
