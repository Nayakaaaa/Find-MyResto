/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

/**
 *
 * @author REYHAN NAYAKA UTOMO_2311103071
 */
public class Review {

    private String namaResto;
    private String reviewer;
    private String komentar;
    private double rating;

    // Konstruktor
    public Review(String namaResto, String reviewer, String komentar, double rating) {
        this.namaResto = namaResto;
        this.reviewer = reviewer;
        this.komentar = komentar;
        this.rating = rating;
    }

    // Getter dan Setter
    public String getResto() {
        return namaResto;
    }

    public void getResto(String namaResto) {
        this.namaResto = namaResto;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
