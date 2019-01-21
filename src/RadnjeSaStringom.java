public class RadnjeSaStringom {


    public int duzinaStringa(String unos) {
        int brojac = 0;
        for(int i = 0; i < unos.length(); i++) {
            if (!Character.isLetter(unos.charAt(i))) {
                continue;

            } else
                brojac++;
        }
        return brojac;

    }

    public String karakteriNaParnoj(String unos) {
        String parni = "";
        for (int i = 0; i < unos.length(); i++){
            if(!Character.isLetter(unos.charAt(i))){
                continue;
            } else if(i % 2 == 0){
                parni += unos.charAt(i);
            }

        }
        return parni;
    }

    public String karakteriNaNeparnoj(String unos) {
        String neparni = "";
        for (int i = 0; i < unos.length(); i++){
            if(!Character.isLetter(unos.charAt(i))){
                continue;
            } else if(i % 2 != 0){
                neparni += unos.charAt(i);
            }

        }
        return neparni;
    }

    public int brojUppercaseKaraktera(String unos) {
        int brojac = 0;
        for (int i = 0; i < unos.length(); i++ ){
            if (!Character.isUpperCase(unos.charAt(i))){
                continue;
            } else {
                brojac++;
            }
        }
        return brojac;
    }
    public int brojLowercaseKaraktera(String unos) {
        int brojac = 0;
        for (int i = 0; i < unos.length(); i++ ){
            if (!Character.isLowerCase(unos.charAt(i))){
                continue;
            } else {
                brojac++;
            }
        }
        return brojac;
    }

    public String nijeSlovo(String unos) {
        String svastara = "";
        for (int i = 0; i < unos.length(); i++){
            if (Character.isLetter(unos.charAt(i)) ||  Character.isWhitespace(unos.charAt(i))){
                continue;
            } else
            {
                svastara += unos.charAt(i);
            }
        }
        return svastara;
    }
}
