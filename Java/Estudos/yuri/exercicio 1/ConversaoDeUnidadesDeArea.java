public class ConversaoDeUnidadesDeArea{
    
    public static double metroQuadradoParaPesQuadrados(double metros){
        double pes = metros * 10.76;
        return pes;
    }

    public static double peQuadradoParaCentimetroQuadrado(double pes){
        double centimetros = pes * 929.03;
        return centimetros;
    }

    public static double milhaQuadraaParaAcres(double milhas){
        double acres = milhas * 640;
        return acres;
    }

    public static double acreParaPesQuadrados(double acres) {
        double pes = acres * 43560;
        return pes;
    }
}