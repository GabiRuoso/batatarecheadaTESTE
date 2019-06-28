package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {
    public int criar_vet (String frase){
        int t = frase.length();
        
        char vet[] = new char[t];
        
        for(int i = 0; i < t; i++){
            char carac = frase.charAt(i);
            vet[i] = carac;
        }
        
        int cont = 0;
        for (int i = 0; i < t; i++ ){
            if(vet[i] == ' '){
                cont = cont + 1;
            }
        }
        return cont;
   
    }
    
}
