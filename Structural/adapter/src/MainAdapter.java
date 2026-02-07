void main() {
    AnalyseurVentes analyseur = new CSVAdapter("./Structural/adapter/src/ventes.csv");
    BurgerAnalytics analytics = new BurgerAnalytics(analyseur);
    analytics.genererRapport();
}