public class buscaArray {
    public static void main(String[]args){
        String[] tiposDeCafe = {"Extra Forte", "Forte", "Suave", "Descafeinado"};
        String busca = "Extra Forte";
        for (String cafe : tiposDeCafe){
            if(busca.equals(cafe)){
                System.out.println("Valor encontrado");
            }
        }

       /* busca = "forte";
        for (int i=0; i<tiposDeCafe.length; i++){
            if (busca.equals(tiposDeCafe[i])){
                System.out.println("Valor encontrado");
            }
        }*/
    }
}
