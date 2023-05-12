package uts13792;

public class Mahasiswa {

    //Atribut
    String nim;
    String nama;
    int semester;
    int usia;
    String krs[];

    public Mahasiswa(String nim, String nama, int semester, int usia, String krs[])
    {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    public float hitungRataNilai(int[] nilai)
    {
        int total = 0;
        for(int i = 0; i < nilai.length; i++)
        {
            total += nilai[i];
        }
        return(float) total/nilai.length;
    }

    public void infoMahasiswa()
    {
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Semester : "+semester);
        System.out.println("Usia : "+usia);
    }

    public void infoKrsMahasiswa()
    {
        System.out.println("KRS : ");
        for(int i = 0; i < krs.length; i++)
        {
            System.out.println("- "+krs[i]);
        }
    }
}