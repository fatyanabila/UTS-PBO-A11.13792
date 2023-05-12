package uts13792;

public class MahasiswaBaru extends Mahasiswa {
    
    String asalSekolah;

    //Constructors
    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah)
    {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }

    //Method ikutOspek
    public boolean ikutOspek()
    {
        return true;
    }

    //Method infoMahasiswa
    public void infoMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah : "+ asalSekolah);
    }
}