public class Siswi{
    String namaSiswi, noNis, namaSekolah, alamatSiswi;

    public Siswi(String nama, String nis, String sekolah, String alamat){
        this.namaSiswi = nama;
        this.noNis = nis;
        this.namaSekolah = sekolah;
        this.alamatSiswi = alamat;
    }
    //Method

    // Getter
    public String getNama(){
        return this.namaSiswi;
    }

    public String getNis(){
        return this.noNis;
    }
    
    public String getSekolah(){
        return this.namaSekolah;
    }

    public String getAlamat(){
        return this.alamatSiswi;
    }


    //setter
    public void setNama(String x){
        this.namaSiswi = x;
    } 
    public void setNis(String x){
        this.noNis= x;
    } 

    public void setSekolah(String x){
        this.namaSekolah = x;
    } 

    public void setAlamat(String x){
        this.alamatSiswi = x;
    } 

    public static void main(String[] args) {
        Siswi sis = new Siswi("Desi","1512410","SMK Kesehatan Riksa","Cisauk");
        
        System.out.println(sis.getNama());
    }
}