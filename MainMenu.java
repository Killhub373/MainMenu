import java.text.DecimalFormat;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Silahkan Login Terlebih Dahulu");
        System.out.print("Nama: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        System.out.print("Pin: ");
        String pin = sc.next();

        if (username.equals("Administrator") && password.length() >= 5 && pin.equals("123456789")) {
            System.out.println("Akses Diterima, Selamat Datang!!");
            mainMenu(sc);
        } else {
            System.out.println("Akses Ditolak. Coba Lagi.");
        }

        sc.close();
    }

    public static void mainMenu(Scanner sc) {
        while (true) {
            System.out.println("===Silahkan Pilih Menu===");
            System.out.println(" 1.Bangun Ruang/Datar");
            System.out.println(" 2.Konversi");
            System.out.println(" 3.Secret Menu");
            System.out.println(" 4.Exit");
            System.out.print("Input Untuk Memilih Menu Diatas: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    bangunRuangDatarMenu(sc);
                    break;
                case 2:
                    konversiMenu(sc);
                    break;
                case 3:
                    secretMenu(sc);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void bangunRuangDatarMenu(Scanner sc) {
        while (true) {
            System.out.println("<==Bangun Ruang Datar==>");
            System.out.println("Silahkan Pilih Rumus:");
            System.out.println(" 1.Luas(Meter Kuadrat)");
            System.out.println(" 2.Volume(Liter)");
            System.out.println(" 3.Exit");
            System.out.print("Masukkan Nomor: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculateArea(sc);
                    break;
                case 2:
                    calculateVolume(sc);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void calculateArea(Scanner sc) {
        while (true) {
            System.out.println("Silahkan Pilih Menu:");
            System.out.println("1).Persegi Panjang");
            System.out.println("2).Persegi");
            System.out.println("3).Segitiga");
            System.out.println("4).Lingkaran");
            System.out.println("5).Exit");
            System.out.print("Silahkan Pilih: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Panjang: ");
                    float panjang = sc.nextFloat();
                    System.out.print("Masukkan Lebar: ");
                    float lebar = sc.nextFloat();
                    System.out.println("Hasilnya: " + (panjang * lebar) + " m²");
                    break;
                case 2:
                    System.out.print("Masukkan Sisi: ");
                    float sisi = sc.nextFloat();
                    System.out.println("Hasilnya: " + (sisi * sisi) + " m²");
                    break;
                case 3:
                    System.out.print("Masukkan Alas: ");
                    float alas = sc.nextFloat();
                    System.out.print("Masukkan Tinggi: ");
                    float tinggi = sc.nextFloat();
                    System.out.println("Hasilnya: " + (0.5 * alas * tinggi) + " m²");
                    break;
                case 4:
                    System.out.print("Masukkan Radius: ");
                    float radius = sc.nextFloat();
                    System.out.println("Hasilnya: " + (Math.PI * radius * radius) + " m²");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void calculateVolume(Scanner sc) {
        while (true) {
            System.out.println("Pilihan Menu:");
            System.out.println("1.Balok");
            System.out.println("2.Kubus");
            System.out.println("3.Bola");
            System.out.println("4.Exit");
            System.out.print("Silahkan Pilih: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Panjang: ");
                    float panjang = sc.nextFloat();
                    System.out.print("Masukkan Lebar: ");
                    float lebar = sc.nextFloat();
                    System.out.print("Masukkan Tinggi: ");
                    float tinggi = sc.nextFloat();
                    System.out.println("Hasilnya: " + (panjang * lebar * tinggi) + " Liter");
                    break;
                case 2:
                    System.out.print("Masukkan Sisi: ");
                    float sisi = sc.nextFloat();
                    System.out.println("Hasilnya: " + (Math.pow(sisi, 3)) + " Liter");
                    break;
                case 3:
                    System.out.print("Masukkan Radius: ");
                    float radius = sc.nextFloat();
                    System.out.println("Hasilnya: " + ((4 / 3.0) * Math.PI * Math.pow(radius, 3)) + " Liter");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void konversiMenu(String[] args) {
        Scanner scanner = new Scanner(System.in);
        konversiMenu(scanner);
    }

    public static void konversiMenu(Scanner sc) {
        while (true) {
            System.out.println("Pilih Menu di bawah ini:");
            System.out.println(" 1. Derajat");
            System.out.println(" 2. Panjang (meter)");
            System.out.println(" 3. Berat (gram)");
            System.out.println(" 4. Exit");
            System.out.print("Masukkan pilihan: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertTemperature(sc);
                    break;
                case 2:
                    convertLength(sc);
                    break;
                case 3:
                    convertWeight(sc);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void convertTemperature(Scanner sc) {
        while (true) {
            System.out.println("Suhu:");
            System.out.println("Silahkan Pilih:");
            System.out.println(" 1. Celcius");
            System.out.println(" 2. Farenhait");
            System.out.println(" 3. Reamur");
            System.out.println(" 4. Exit");
            System.out.print("Masukkan Pilihan: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    konversiSatuanSuhu(sc, "Celcius");
                    break;
                case 2:
                    konversiSatuanSuhu(sc, "Farenhait");
                    break;
                case 3:
                    konversiSatuanSuhu(sc, "Reamur");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void konversiSatuanSuhu(Scanner sc, String satuan) {
        DecimalFormat df = new DecimalFormat("#.######");

        while (true) {
            System.out.println("Pilih konversi " + satuan + ":");
            System.out.println(" 1. " + satuan + " ke Farenhait");
            System.out.println(" 2. " + satuan + " ke Reamur");
            System.out.println(" 3. Ke satuan lain");
            System.out.println(" 4. Exit");
            System.out.print("Masukkan pilihan: ");
            int subChoice = sc.nextInt();
            if (subChoice == 4)
                break;

            System.out.print("Masukkan nilai dalam " + satuan + ": ");
            float value = sc.nextFloat();

            if (subChoice == 1) {
                if (satuan.equals("Celcius")) {
                    System.out.println(value + " Celcius diubah ke " + df.format((value * 9 / 5) + 32) + " Farenhait");
                } else if (satuan.equals("Reamur")) {
                    System.out.println(value + " Reamur diubah ke " + df.format((value * 9 / 4) + 32) + " Farenhait");
                } else if (satuan.equals("Farenhait")) {
                    System.out.println(value + " Farenhait diubah ke " + df.format((value - 32) * 5 / 9) + " Celcius");
                }
            } else if (subChoice == 2) {
                if (satuan.equals("Celcius")) {
                    System.out.println(value + " Celcius diubah ke " + df.format(value * 4 / 5) + " Reamur");
                } else if (satuan.equals("Farenhait")) {
                    System.out.println(value + " Farenhait diubah ke " + df.format((value - 32) * 4 / 9) + " Reamur");
                } else if (satuan.equals("Reamur")) {
                    System.out.println(value + " Reamur diubah ke " + df.format(value * 5 / 4) + " Celcius");
                }
            } else if (subChoice == 3) {
                System.out.println("Pilih satuan lain untuk konversi:");
                System.out.println(" 1. Celcius");
                System.out.println(" 2. Farenhait");
                System.out.println(" 3. Reamur");
                System.out.println(" 4. Exit");
                System.out.print("Masukkan Pilihan: ");
                int otherChoice = sc.nextInt();
                System.out.print("Masukkan nilai dalam " + satuan + ": ");
                float otherValue = sc.nextFloat();

                switch (otherChoice) {
                    case 1:
                        if (!satuan.equals("Celcius")) {
                            if (satuan.equals("Farenhait")) {
                                System.out.println(otherValue + " Farenhait diubah ke "
                                        + df.format((otherValue - 32) * 5 / 9) + " Celcius");
                            } else if (satuan.equals("Reamur")) {
                                System.out.println(
                                        otherValue + " Reamur diubah ke " + df.format(otherValue * 5 / 4) + " Celcius");
                            }
                        }
                        break;
                    case 2:
                        if (!satuan.equals("Farenhait")) {
                            if (satuan.equals("Celcius")) {
                                System.out.println(otherValue + " Celcius diubah ke "
                                        + df.format((otherValue * 9 / 5) + 32) + " Farenhait");
                            } else if (satuan.equals("Reamur")) {
                                System.out.println(otherValue + " Reamur diubah ke "
                                        + df.format((otherValue * 9 / 4) + 32) + " Farenhait");
                            }
                        }
                        break;
                    case 3:
                        if (!satuan.equals("Reamur")) {
                            if (satuan.equals("Celcius")) {
                                System.out.println(
                                        otherValue + " Celcius diubah ke " + df.format(otherValue * 4 / 5) + " Reamur");
                            } else if (satuan.equals("Farenhait")) {
                                System.out.println(otherValue + " Farenhait diubah ke "
                                        + df.format((otherValue - 32) * 4 / 9) + " Reamur");
                            }
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void convertLength(Scanner sc) {
        while (true) {
            System.out.println("Panjang:");
            System.out.println("Silahkan Pilih:");
            System.out.println(" 1. Kilometer");
            System.out.println(" 2. Hektometer");
            System.out.println(" 3. Dekameter");
            System.out.println(" 4. Desimeter");
            System.out.println(" 5. Sentimeter");
            System.out.println(" 6. Milimeter");
            System.out.println(" 7. Exit");
            System.out.print("Masukkan Pilihan: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    konversiSatuan(sc, "Kilometer", 1000);
                    break;
                case 2:
                    konversiSatuan(sc, "Hektometer", 100);
                    break;
                case 3:
                    konversiSatuan(sc, "Dekameter", 10);
                    break;
                case 4:
                    konversiSatuan(sc, "Desimeter", 0.1);
                    break;
                case 5:
                    konversiSatuan(sc, "Sentimeter", 0.01);
                    break;
                case 6:
                    konversiSatuan(sc, "Milimeter", 0.001);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void konversiSatuan(Scanner sc, String satuan, double faktor) {
        DecimalFormat df = new DecimalFormat("#.######");

        while (true) {
            System.out.println("Pilih konversi " + satuan + ":");
            System.out.println(" 1. Meter ke " + satuan);
            System.out.println(" 2. " + satuan + " ke Meter");
            System.out.println(" 3. Ke satuan lain");
            System.out.println(" 4. Exit");
            System.out.print("Masukkan pilihan: ");
            int subChoice = sc.nextInt();
            if (subChoice == 4)
                break;

            if (subChoice == 1 || subChoice == 2) {
                System.out.print("Masukkan nilai: ");
                float value = sc.nextFloat();
                if (subChoice == 1) {
                    System.out.println(value + " Meter diubah ke " + df.format(value / faktor) + " " + satuan);
                } else if (subChoice == 2) {
                    System.out.println(value + " " + satuan + " diubah ke " + df.format(value * faktor) + " Meter");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (subChoice == 3) {
                System.out.println("Pilih satuan lain untuk konversi:");
                System.out.println(" 1. Kilometer");
                System.out.println(" 2. Hektometer");
                System.out.println(" 3. Dekameter");
                System.out.println(" 4. Desimeter");
                System.out.println(" 5. Sentimeter");
                System.out.println(" 6. Milimeter");
                System.out.println(" 7. Exit");
                System.out.print("Masukkan Pilihan: ");
                int otherChoice = sc.nextInt();
                System.out.print("Masukkan nilai dalam " + satuan + ": ");
                float otherValue = sc.nextFloat();
                switch (otherChoice) {
                    case 1:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 1000)) + " Kilometer");
                        break;
                    case 2:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 100)) + " Hektometer");
                        break;
                    case 3:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 10)) + " Dekameter");
                        break;
                    case 4:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 0.1)) + " Desimeter");
                        break;
                    case 5:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 0.01)) + " Sentimeter");
                        break;
                    case 6:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 0.001)) + " Milimeter");
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void convertWeight(Scanner sc) {
        while (true) {
            System.out.println("Berat:");
            System.out.println("Silahkan Pilih:");
            System.out.println(" 1. Kilogram");
            System.out.println(" 2. Hektogram");
            System.out.println(" 3. Dekagram");
            System.out.println(" 4. Desigram");
            System.out.println(" 5. Sentigram");
            System.out.println(" 6. Miligram");
            System.out.println(" 7. Exit");
            System.out.print("Masukkan Pilihan: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    konversiSatuanBerat(sc, "Kilogram", 1000);
                    break;
                case 2:
                    konversiSatuanBerat(sc, "Hektogram", 100);
                    break;
                case 3:
                    konversiSatuanBerat(sc, "Dekagram", 10);
                    break;
                case 4:
                    konversiSatuanBerat(sc, "Desigram", 0.1);
                    break;
                case 5:
                    konversiSatuanBerat(sc, "Sentigram", 0.01);
                    break;
                case 6:
                    konversiSatuanBerat(sc, "Miligram", 0.001);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void konversiSatuanBerat(Scanner sc, String satuan, double faktor) {
        DecimalFormat df = new DecimalFormat("#.######");

        while (true) {
            System.out.println("Pilih konversi " + satuan + ":");
            System.out.println(" 1. Gram ke " + satuan);
            System.out.println(" 2. " + satuan + " ke Gram");
            System.out.println(" 3. Ke satuan lain");
            System.out.println(" 4. Exit");
            System.out.print("Masukkan pilihan: ");
            int subChoice = sc.nextInt();
            if (subChoice == 4)
                break;

            if (subChoice == 1 || subChoice == 2) {
                System.out.print("Masukkan nilai: ");
                float value = sc.nextFloat();
                if (subChoice == 1) {
                    System.out.println(value + " Gram diubah ke " + df.format(value / faktor) + " " + satuan);
                } else if (subChoice == 2) {
                    System.out.println(value + " " + satuan + " diubah ke " + df.format(value * faktor) + " Gram");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (subChoice == 3) {
                System.out.println("Pilih satuan lain untuk konversi:");
                System.out.println(" 1. Kilogram");
                System.out.println(" 2. Hektogram");
                System.out.println(" 3. Dekagram");
                System.out.println(" 4. Desigram");
                System.out.println(" 5. Sentigram");
                System.out.println(" 6. Miligram");
                System.out.println(" 7. Exit");
                System.out.print("Masukkan Pilihan: ");
                int otherChoice = sc.nextInt();
                System.out.print("Masukkan nilai dalam " + satuan + ": ");
                float otherValue = sc.nextFloat();
                switch (otherChoice) {
                    case 1:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 1000)) + " Kilogram");
                        break;
                    case 2:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 100)) + " Hektogram");
                        break;
                    case 3:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 10)) + " Dekagram");
                        break;
                    case 4:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 0.1)) + " Desigram");
                        break;
                    case 5:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 0.01)) + " Sentigram");
                        break;
                    case 6:
                        System.out.println(otherValue + " " + satuan + " diubah ke "
                                + df.format(otherValue * (faktor / 0.001)) + " Miligram");
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }


    public static void secretMenu(Scanner sc) {
        System.out.print("Masukkan kode unik: ");
        String code = sc.next();

        if (code.length() >= 7 && code.length() <= 10 && code.matches("\\d+")) {
            System.out.println("Selamat Datang VIP!!");
            while (true) {
                System.out.println("Silahkan Pilih Menu Rahasia");
                System.out.println(" 1. Uppercase");
                System.out.println(" 2. Lowercase");
                System.out.println(" 3. Reverse");
                System.out.println(" 4. Exit");
                System.out.print("Anda Memilih Nomor: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Masukkan Sesuatu Kalimat: ");
                        sc.nextLine();
                        String input = sc.nextLine();
                        System.out.println("Hasilnya: " + input.toUpperCase());
                        break;
                    case 2:
                        System.out.print("Masukkan Kalimat: ");
                        sc.nextLine();
                        input = sc.nextLine();
                        System.out.println("Hasil: " + input.toLowerCase());
                        break;
                    case 3:
                        System.out.print("Mengubah Susunan Kata menjadi Terbalik\nMasukkan Data: ");
                        sc.nextLine();
                        input = sc.nextLine();
                        String reversedWords = reverseWords(input);
                        System.out.println("Hasil: " + reversedWords);
                        break;
                    case 4:
                        System.out.println("Kembali Ke Menu Pertama");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        } else {
            System.out.println("Kode unik harus lebih dari tujuh dan kurang dari sepuluh karakter");
        }
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
