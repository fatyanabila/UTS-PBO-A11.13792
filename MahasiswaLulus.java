package uts13792;

public class MahasiswaLulus extends Mahasiswa {
    int tahunWisuda;
    float ipk;

    //Constructors
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk)
    {
        super(nim, nama, semester, usia, krs);

        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    //Method ikutWisuda
    public boolean ikutWisuda()
    {
        return true;
    }

    //Method infoMahasiswa
    public void infoKrsMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda"+ tahunWisuda);
        System.out.println("IPK : "+ipk);
    }
}
