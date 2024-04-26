# Calculator-Testing
Make Simple Calculator App in Java for Automation Testing

## Anggota Tim
1. Fadhil Radja Assydiq | 211524008
2. Maolana Firmansyah   | 211524013
3. Zacky Faishal Abror  | 211524031

## Cara Penggunaan
1. Clone repository.
    ```
   git clone https://github.com/ZackyFaishal/Calculator-Testing.git
   ```
2. Buka project menggunakan Visual Studio Code atau Java IDE lainnya.
3. Jalankan program pada file `\src\main\java\testing\calculator\App.java` dengan Run Java.
4. Masukkan angka pertama, angka kedua dan juga operasi yang diinginkan.
5. Hasil ditampilkan
   ![ss calculator](https://github.com/ZackyFaishal/Calculator-Testing/assets/95175098/6a57d906-1fa6-42d1-829b-9a1e0fb905dc)

# Automation Testing
## Prerequisites
1. Install JDK.
2. Install Maven.
3. Install Extension Pack for Java (Jika menggunakan Visual Studio Code).

## Structure Project Test
Berikut ini merupakan struktur direktori dari program kalkulator ketika menggunakan maven
![Struktur file](https://github.com/ZackyFaishal/Calculator-Testing/assets/95175098/cfb9c598-29c1-42ff-9d18-495aca7fd209)
* Terdapat program calculator pada bagian src->main->java->testing->calculator dengan 4 program utama
* Program testing nya dibuat pada bagian src->test->java->testing->calculator dimana masing masing file tersebut merepresentasikan program testing dari class yang dibuat
* Class AppTest merupakan kelas utama atau kelas Main dari aplikasi kalkulator ini
* Class Calculate merupakan kelas untuk melakukan penghitungan dari operasi yang dimasukan
* Class Opertaion merupakan kelas untuk melakukan operasi dari kiriman calculate
* Class Validation merupakan kelas untuk memvalidasi inputan sesuai dengan requirement yang diberikan


## Run Automation Test
1. Jalankan perintah berikut pada terminal:
   a. Bila ingin melakukan test pada semua modul, masukan perintah berikut :
   ```
   mvn test
   ```
    ![mvntest](https://github.com/ZackyFaishal/Calculator-Testing/assets/95175098/150166e5-62fe-46d8-bb4e-cf0373584a66)

   b. Bila ingin melakukan test pada hanya 1 class saja, masukan perintah berikut :
   ```
   mvn test -Dtest=NamaFileTest test
   ```
   ![testclass](https://github.com/ZackyFaishal/Calculator-Testing/assets/95175098/91d0aba2-2908-4fae-bb1e-8621811a9106)

   c. Bila ingin melakukan test pada hanya 1 modul saja, masukan perintah berikut :
   ```
   mvn test -Dtest=NamaFileTest#namaModul test
   ```
   ![testModul](https://github.com/ZackyFaishal/Calculator-Testing/assets/95175098/a6242099-9466-4b14-b616-9b05e78cae86)

3. Untuk melihat hasil report testing jalankan perintah berikut pada terminal:
    ```
   mvn site
   ```
    ![mvnstie](https://github.com/ZackyFaishal/Calculator-Testing/assets/95175098/7dc7f49e-74e1-49b2-8fd8-f0f672ba5374)

4. Buka hasil report pada file `\target\site\surefire-report.html` dalam browser.
   ![TestReport](https://github.com/ZackyFaishal/Calculator-Testing/assets/101083495/d6985689-041e-46f2-9562-7481bfb3780b)
