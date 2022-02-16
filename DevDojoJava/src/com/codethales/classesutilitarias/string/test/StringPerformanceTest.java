package com.codethales.classesutilitarias.string.test;

//Conforme vai aumentado a quantidade de Strings únicas dentro de um sistema, a performance vai caindo tomando cada vez
//mais tempo para executar as ações. Por esta razão o Java criou novas formas de trabalhar com Strings.
public class StringPerformanceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(30_000); //Com este método, levamos mais de 578ms para concatenar 30.000 strings.
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar as Strings criadas com concatString: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000); //Com este método levamos 63ms para concatenar 1.000.000 strings.
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar as Strings criadas com concatStringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000); //Com este método levamos 78ms para concatenar 1.000.000 strings.
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar as Strings criadas com concatStringBuffer: " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho){
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto += i; // A cada iteração será criada uma nova String no pool de string(0, 1, 2, 3, 4...)
        }
    }

    //Executando a mesma ação do método acima, mas utilizando a classe StringBuilder do Java
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i); // A cada iteração será criada uma nova String no pool de string(0, 1, 2, 3, 4...)
        }
    }

    //Este método é praticamente identico ao anterior, a única diferença é que a classe StringBuffer
    // foi desenvolvida para ambientes em que se trabalha com multi thread.
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i); // A cada iteração será criada uma nova String no pool de string(0, 1, 2, 3, 4...)
        }
    }


}
