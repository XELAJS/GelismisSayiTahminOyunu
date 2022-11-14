import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Sayı tahmin oyununa hoşgeldiniz.Tek oyunculu mu oynamak istersiniz çift oyunculu mu:(tek/çift)");
        String oyuncu = girdi.next();
        System.out.println("");
        int sayi1=rnd.nextInt(10000);
        int i=1;
        if (oyuncu.equals("tek")) {
            System.out.print("Başlamadan önce kuralları okumanızı öneririz kuralları okumak ister misiniz?: (evet/hayır)");
            String onay1 = girdi.next();
            if (onay1.equals("evet")) {
                System.out.println("");
                System.out.println("Bu oyunda 0 ile 10000 arasında herhangi bir sayı belirlenir ve siz doğru sayıyı bulmaya çalışırsınız." +
                        "\n Oyunda toplam 15 hakkınız bulunmaktadır.Eğer hakkınız biterse oyunu kaybedersiniz." +
                        "\n Eğer hakkınız bitmeden sayıyı bulabilirseniz oyunu kazanırsınız.İyi oyunlar.");
                System.out.println("");
            } else if (onay1.equals("hayır")) {
                System.out.println("");

            } else {
                System.out.println("Lütfen parantez içinde belirtilenlerden birini yazınız.");
                return;
            }
            System.out.print("Lütfen kullanıcı adınızı giriniz:");
            String ad= girdi.next();
            System.out.println("");
            System.out.println("Sayı tahmin oyunana hoşgeldiniz.");
            System.out.println("");
            System.out.print(ad+" lütfen 10000 e kadar herhangi bir sayı giriniz:");
            int tahmin= girdi.nextInt();
            System.out.println("");
            if (tahmin < 0 || tahmin > 10000) {

                System.out.print(ad + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)");

                i++;

                tahmin = girdi.nextInt();
                System.out.println("");

            } else if (tahmin > sayi1) {

                System.out.print(ad + " lütfen daha küçük bir sayı giriniz:");
                i++;

                tahmin = girdi.nextInt();
                System.out.println("");

            } else if (tahmin < sayi1) {
                System.out.print(ad+ " lütfen daha büyük bir sayı giriniz:");
                i++;

                tahmin = girdi.nextInt();
                System.out.println("");

            } else {
                System.out.println(ad + " " + i + " defa deneyerek doğru bildiniz tbrikler.Oyunu yeniden oynamak\n"+
                        "için uygulamayı tekrar başlatın");
                return;
            }while(tahmin != sayi1){
                if(i<=20) {
                    if (tahmin < 0 || tahmin > 10000) {

                        System.out.print(ad + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                "\nSıra sizde" + ad + ":");
                        i++;

                        tahmin = girdi.nextInt();
                        System.out.println("");

                    } else if (tahmin > sayi1) {

                        System.out.print(ad + " lütfen daha küçük bir sayı giriniz:");
                        i++;

                        tahmin = girdi.nextInt();
                        System.out.println("");

                    } else if (tahmin < sayi1) {
                        System.out.print(ad + " lütfen daha büyük bir sayı giriniz:");
                        i++;

                        tahmin = girdi.nextInt();
                        System.out.println("");

                    }
                }else {
                    System.out.println(ad+" hakkınız maalesef doldu.Oyunu kaybettiniz.");
                    System.out.println("Eğer tekrar denemek isterseniz programı yeniden çalıştırınız.");
                    return;
                }


            }System.out.println(ad + " " + i + " defa deneyerek doğru bildiniz tebrikler.Oyunu yeniden oynamak\n"+
                    "için lütfen uygulamayı tekrar çalıştırınız");

            return;



        } else if (oyuncu.equals("çift")) {
            System.out.print("Başlamadan önce kuralları okumanızı öneririz kuralları okumak ister misiniz (evet/hayır)");
            String onay2 = girdi.next();
            System.out.println("");
            if (onay2.equals("evet")) {
                System.out.println("Bu oyunda 0 ile 10000 arasında herhangi bir sayı belirlenir ve siz doğru sayıyı bulmaya çalışırsınız." +
                        "\n Bu modda sıra önce 1.oyuncuyla başlar eğer 1.oyuncu cevabı doğru bulamassa sıra 2.oyuncuya geçer." +
                        "\n Oyunda her oyuncunun 15 hakkı vardır hakkınız dolduğunda oyunu kaybedersiniz.Eğer 2 oyuncununda hakkı biterse oyun berabere olur kimseye puan verilmez." +
                        "\n Eğer herhangi bir oyuncu cevabı doru bulduysa ona 1 puan eklenir.Önce hangi oyuncunun 2 puanı olursa o kazanır." +"\n" +
                                "Oyunumuz 3 defa tekrarlanabilir olduğundan eğer 3 elde kimse 2 olamassa puanı yüksek olan kazanır"+"\n"+
                        "Puanlar eşit ise berabere sayılırlar"+
                        "\n Her set sonunda önceki seti bilen oyuncunun  oynama önceliği vardır.İyi oyunlar.");
            } else if (onay2.equals("hayır")) {
            } else {
                System.out.println("Lütfen parantez içinde belirtilenlerden birini yazınız.");
                return;
            }

            System.out.print("1.oyuncu adını giriniz:");
            String oyuncu1 = girdi.next();
            System.out.println("");

            System.out.print("2.oyuncu adını giriniz:");
            String oyuncu2 = girdi.next();
            System.out.println("");

            int sayi = rnd.nextInt(10000);

            int tahmin2 = -1;
            int i1 = 1;
            int i2 = 0;
            int puan1 = 0;
            int puan2 = 0;
            String sira = oyuncu1;


            System.out.print(oyuncu1 + " lütfen 10000 e kadar bir değer giriniz:");
            int tahmin1 = girdi.nextInt();
            System.out.println("");
            if (tahmin1 < 0 || tahmin1 > 10000) {

                System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                        "\nSıra sizde" + oyuncu2 + ":");
                i1++;
                sira = oyuncu2;
                tahmin2 = girdi.nextInt();
                System.out.println("");

            } else if (tahmin1 > sayi) {

                System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                i1++;
                sira = oyuncu2;
                tahmin2 = girdi.nextInt();
                System.out.println("");

            } else if (tahmin1 < sayi) {
                System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                i1++;
                sira = oyuncu2;
                tahmin2 = girdi.nextInt();
                System.out.println("");

            } else {
                System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                puan1++;
                System.out.print(oyuncu1 + " lütfen bir değer giriniz:");
                tahmin1 = girdi.nextInt();
                System.out.println("");
            }


            while (sayi != tahmin1 || sayi != tahmin2) {

                if (sira.equals(oyuncu2)) {
                    if (i1 == 15 && i2 < 15) {

                        if (tahmin2 < 0 || tahmin2 > 10000 || tahmin2 < sayi || tahmin2 > sayi) {
                            System.out.println("Durum berabere.");
                            break;
                        } else {
                            System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                            puan2++;
                            break;
                        }

                    } else if (i2 < 15) {
                        if (tahmin2 < 0 || tahmin2 > 10000) {

                            System.out.print(oyuncu2 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                    "\nSıra sizde " + oyuncu1 + ":");
                            i2++;
                            sira = oyuncu1;
                            tahmin1 = girdi.nextInt();
                            System.out.println("");

                        } else if (tahmin2 > sayi) {
                            System.out.print(oyuncu1 + " lütfen daha küçük bir sayı giriniz:");
                            i2++;
                            sira = oyuncu1;
                            tahmin1 = girdi.nextInt();
                            System.out.println("");

                        } else if (tahmin2 < sayi) {
                            System.out.print(oyuncu1 + " lütfen daha büyük bir sayı giriniz:");
                            i2++;
                            sira = oyuncu1;
                            tahmin1 = girdi.nextInt();
                            System.out.println("");

                        } else {
                            System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                            puan2++;
                            System.out.println("");
                            break;
                        }
                    } else {
                        System.out.println(oyuncu2 + " hakkın doldu.");
                        sira = oyuncu1;
                        System.out.println("");
                        break;
                    }
                } else {
                    if (i1 < 15) {
                        if (tahmin1 < 0 || tahmin1 > 10000) {

                            System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                    "\nSıra sizde " + oyuncu2 + ":");
                            i1++;
                            sira = oyuncu2;
                            tahmin2 = girdi.nextInt();
                            System.out.println("");

                        } else if (tahmin1 > sayi) {
                            System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                            i1++;
                            sira = oyuncu2;
                            tahmin2 = girdi.nextInt();
                            System.out.println("");

                        } else if (tahmin1 < sayi) {
                            System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                            i1++;
                            sira = oyuncu2;
                            tahmin2 = girdi.nextInt();
                            System.out.println("");

                        } else {
                            System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                            puan1++;
                            System.out.println("");
                            break;
                        }

                    } else {
                        System.out.println(oyuncu1 + " hakkın doldu.");
                        sira = oyuncu2;
                        System.out.println("");

                    }
                }


            }
            i1 = 0;
            i2 = 0;
            sayi = rnd.nextInt(10000);
            String onay3;
            if (puan1 == 1) {
                System.out.println("İlk oyunu " + oyuncu1 + " kazandı tebrikler " + oyuncu1 +
                        "\nŞuanda puan durumu " + oyuncu1 + ":1" +" " +oyuncu2 + ":0");
                System.out.println("");
                System.out.print("1 tur daha oynicaksanız lütfen 'evet' yazın.Eğer oynamicaksanız 'hayır' yazın böylece " +
                        "\npuanlarınız sıfırlanır ve baştan başlamak için programı yeniden başlatmanız gerekir." +
                        "\nOyunu oynamaya devam edecek misiniz?:");
                onay3 = girdi.next();
                System.out.println("");
            } else if (puan2 == 1) {
                System.out.println("İlk oyunu " + oyuncu2 + " kazandı tebrikler " + oyuncu2 +
                        "\nŞuanda puan durumu " + oyuncu2 + ":1" +" " +oyuncu1 + ":0");
                System.out.println("");
                System.out.println("1 tur daha oynicaksanız lütfen 'evet' yazın.Eğer oynamicaksanız 'hayır' yazın böylece " +
                        "\npuanlarınız sıfırlanır ve baştan başlamak için programı yeniden başlatmanız gerekir." +
                        "\nOyunu oynamaya devam edecek misiniz?:");
                onay3 = girdi.next();
                System.out.println("");

            } else {
                System.out.println("İlk oyun berabere sonlandı." +
                        "\nŞuanda puan durumu" + oyuncu1 + ":0" + oyuncu2 + ":0");
                System.out.println("");
                System.out.println("1 tur daha oynicaksanız lütfen 'evet' yazın.Eğer oynamicaksanız 'hayır' yazın böylece " +
                        "\npuanlarınız sıfırlanır ve baştan başlamak için programı yeniden başlatmanız gerekir." +
                        "\nOyunu oynamaya devam edecek misiniz?:");
                onay3 = girdi.next();
                System.out.println("");
            }
            if (onay3.equals("evet")) {
                while (sayi != tahmin1 || sayi != tahmin2) {

                    if (sira.equals(oyuncu2)) {
                        if (i1 == 15 && i2 < 15) {

                            if (tahmin2 < 0 || tahmin2 > 10000 || tahmin2 < sayi || tahmin2 > sayi) {
                                System.out.println("Durum berabere.");
                                System.out.println("");
                                break;
                            } else {
                                System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                puan2++;
                                System.out.println("");
                                break;
                            }

                        } else if (i2 < 15) {
                            if (tahmin2 < 0 || tahmin2 > 10000) {

                                System.out.print(oyuncu2 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                        "\nSıra sizde " + oyuncu1 + ":");
                                i2++;
                                sira = oyuncu1;
                                tahmin1 = girdi.nextInt();
                                System.out.println("");

                            } else if (tahmin2 > sayi) {
                                System.out.print(oyuncu1 + " lütfen daha küçük bir sayı giriniz:");
                                i2++;
                                sira = oyuncu1;
                                tahmin1 = girdi.nextInt();
                                System.out.println("");

                            } else if (tahmin2 < sayi) {
                                System.out.print(oyuncu1 + " lütfen daha büyük bir sayı giriniz:");
                                i2++;
                                sira = oyuncu1;
                                tahmin1 = girdi.nextInt();
                                System.out.println("");

                            } else {
                                System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                puan2++;
                                System.out.println("");
                                break;
                            }
                        } else {
                            System.out.println(oyuncu2 + " hakkın doldu.");
                            sira = oyuncu1;
                            System.out.println("");
                            break;
                        }
                    } else {
                        if (i1 < 15) {
                            if (tahmin1 < 0 || tahmin1 > 10000) {

                                System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                        "\nSıra sizde " + oyuncu2 + ":");
                                i1++;
                                sira = oyuncu2;
                                tahmin2 = girdi.nextInt();
                                System.out.println("");

                            } else if (tahmin1 > sayi) {
                                System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                                i1++;
                                sira = oyuncu2;
                                tahmin2 = girdi.nextInt();
                                System.out.println("");

                            } else if (tahmin1 < sayi) {
                                System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                                i1++;
                                sira = oyuncu2;
                                tahmin2 = girdi.nextInt();
                                System.out.println("");

                            } else {
                                System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                puan1++;
                                System.out.println("");
                                break;
                            }

                        } else {
                            System.out.println(oyuncu1 + " hakkın doldu.");
                            sira = oyuncu2;
                            System.out.println("");

                        }
                    }


                }
            } else if (onay3.equals("hayır")) {
                return;
            } else {
                i1 = 0;
                i2 = 0;
                sayi = rnd.nextInt(10000);
                if (puan1 == 2) {
                    System.out.println("Oyunu " + oyuncu1 + " kazandı tebrikler " + oyuncu1 + ".\n" +
                            "Şuanki puan durumu" + " " + oyuncu1 + ":" + puan1 + "\n" + oyuncu2 + ":" + puan2);
                    System.out.println("");
                    System.out.println("Bir kere daha oynamak için lütfen programı yeniden başlatın.");
                    System.out.println("");
                    return;

                } else if (puan2 == 2) {
                    System.out.println("Oyunu " + oyuncu2 + " kazandı tebrikler " + oyuncu2 + ".\n" +
                            "Şuanki puan durumu" + " " + oyuncu2 + ":" + puan2 + "\n" + oyuncu1 + ":" + puan1);
                    System.out.println("");
                    System.out.println("Bir kere daha oynamak için lütfen programı yeniden başlatın.");
                    System.out.println("");
                    return;

                } else {
                    while (sayi != tahmin1 || sayi != tahmin2) {

                        if (sira.equals(oyuncu2)) {
                            if (i1 == 15 && i2 < 15) {

                                if (tahmin2 < 0 || tahmin2 > 10000 || tahmin2 < sayi || tahmin2 > sayi) {
                                    System.out.println("Durum berabere.");
                                    System.out.println("");
                                    break;
                                } else {
                                    System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan2++;
                                    System.out.println("");
                                    break;
                                }

                            } else if (i2 < 15) {
                                if (tahmin2 < 0 || tahmin2 > 10000) {

                                    System.out.print(oyuncu2 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                            "\nSıra sizde " + oyuncu1 + ":");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin2 > sayi) {
                                    System.out.print(oyuncu1 + " lütfen daha küçük bir sayı giriniz:");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin2 < sayi) {
                                    System.out.print(oyuncu1 + " lütfen daha büyük bir sayı giriniz:");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else {
                                    System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan2++;
                                    System.out.println("");
                                    break;
                                }
                            } else {
                                System.out.println(oyuncu2 + " hakkın doldu.");
                                sira = oyuncu1;
                                System.out.println("");
                                break;
                            }
                        } else {
                            if (i1 < 15) {
                                if (tahmin1 < 0 || tahmin1 > 10000) {

                                    System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                            "\nSıra sizde " + oyuncu2 + ":");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin1 > sayi) {
                                    System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin1 < sayi) {
                                    System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else {
                                    System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan1++;
                                    System.out.println("");
                                    break;
                                }

                            } else {
                                System.out.println(oyuncu1 + " hakkın doldu.");
                                sira = oyuncu2;
                                System.out.println("");

                            }
                        }

                    }
                }
            }
            i1 = 0;
            i2 = 0;
            sayi = rnd.nextInt(10000);

            if (puan1 == 2) {
                System.out.println("Oyunu " + oyuncu1 + " kazandı tebrikler " + oyuncu1 + ".\n" +
                        "Şuanki puan durumu" + " " + oyuncu1 + ":" + puan1 +" "+ oyuncu2 + ":" + puan2);
                System.out.println("");
                System.out.println("Bir kere daha oynamak için lütfen programı yeniden başlatın.");
                System.out.println("");
                return;

            } else if (puan2 == 2) {
                System.out.println("Oyunu " + oyuncu2 + " kazandı tebrikler " + oyuncu2 + ".\n" +
                        "Şuanki puan durumu" + " " + oyuncu2 + ":" + puan2 + " " + oyuncu1 + ":" + puan1);
                System.out.println("");
                System.out.println("Bir kere daha oynamak için lütfen programı yeniden başlatın.");
                System.out.println("");
                return;

            } else {
                System.out.println("Şuanki puan durumu" + " " + oyuncu1 + ":" + puan1 + " " + oyuncu2 + ":" + puan2);
                System.out.println("");
                System.out.println("Bu son oyun bu oyun bittikten sonra puan durumu yüksek olan kazanmış olacak.\n" +
                        "Eğer puan durumu eşit ise oyuncular berabere sayılacaktır.\nBir dahaki oyun için programı yeniden başlatmanız gerekecek.");
                System.out.println("");
                System.out.print("Son oyunu oynamak ister misiniz?:(evet/hayır)");
                onay3 = girdi.next();
                System.out.println("");

                if (onay3.equals("evet")) {

                    while (sayi != tahmin1 || sayi != tahmin2) {

                        if (sira.equals(oyuncu2)) {
                            if (i1 == 15 && i2 < 15) {

                                if (tahmin2 < 0 || tahmin2 > 10000 || tahmin2 < sayi || tahmin2 > sayi) {
                                    System.out.println("Durum berabere.");
                                    System.out.println("");
                                    break;
                                } else {
                                    System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan2++;
                                    System.out.println("");
                                    break;
                                }

                            } else if (i2 < 15) {
                                if (tahmin2 < 0 || tahmin2 > 10000) {

                                    System.out.print(oyuncu2 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                            "\nSıra sizde " + oyuncu1 + ":");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin2 > sayi) {
                                    System.out.print(oyuncu1 + " lütfen daha küçük bir sayı giriniz:");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin2 < sayi) {
                                    System.out.print(oyuncu1 + " lütfen daha büyük bir sayı giriniz:");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else {
                                    System.out.print(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan2++;
                                    System.out.println("");
                                    break;
                                }
                            } else {
                                System.out.println(oyuncu2 + " hakkın doldu.");
                                sira = oyuncu1;
                                System.out.println("");
                                break;
                            }
                        } else {
                            if (i1 < 15) {
                                if (tahmin1 < 0 || tahmin1 > 10000) {

                                    System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                            "\nSıra sizde " + oyuncu2 + ":");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin1 > sayi) {
                                    System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin1 < sayi) {
                                    System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else {
                                    System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan1++;
                                    System.out.println("");
                                    break;
                                }

                            } else {
                                System.out.println(oyuncu1 + " hakkın doldu.");
                                sira = oyuncu2;
                                System.out.println("");

                            }
                        }


                    }
                    if (puan1>puan2){
                    System.out.println(oyuncu1+" oyunu kazandı tebrikler "+oyuncu1+"\n"+
                    "Skor tablosu şu şekilde:"+oyuncu1+":"+puan1+"" +" "+oyuncu2+":"+puan2);
                        System.out.println("");
                    } else if (puan2>puan1) {

                        System.out.println(oyuncu2+" oyunu kazandı tebrikler "+oyuncu2+"\n"+"\n"+
                                "Skor tablosu şu şekilde:"+oyuncu2+":"+puan2+"" +" "+oyuncu1+":"+puan1);
                        System.out.println("");

                    }else System.out.println("Berabere kaldınız ikinizide tebrik ederiz.");
                    System.out.println("");
                }else return;


            }
        }
    }
}
