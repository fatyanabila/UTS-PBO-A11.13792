package uts13792;

public class MahasiswaTransfer extends MahasiswaBaru{
    //Atribut
    String asalUniversitas;

    //Constructors
    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah, String asalUniversitas)
    {
        super(nim, nama, semester, usia, krs, asalSekolah);
        this.asalUniversitas = asalUniversitas;
    }

    public boolean ikutOspek()
    {
        return false;
    }

    //Method infoMahasiwa
    public void infoMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Asaal Universitas : "+ asalUniversitas);
    }
}
