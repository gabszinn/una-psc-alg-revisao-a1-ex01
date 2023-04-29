import java.util.Scanner;

public class ExercicioUmRevisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        String nome = scanner.next();
        
        System.out.println("Informe a sua idade:");
        int idade = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Seu cartão de vacina está em dia? (SIM/NAO)");
        String cartaoVacina = scanner.next();
        
        System.out.println("Teve algum dos sintomas recentemente? (SIM/NAO)");
        String sintomasRecentes = scanner.next();
        
        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM/NAO)");
        String contatoComPessoasInfectadas = scanner.next();
        
        System.out.println("Está retornando de viagem realizada no exterior? (SIM/NAO)");
        String retornandoDeViagem = scanner.next();
        
        int contadorTentativas = 0;
        
        while ((!"SIM".equalsIgnoreCase(cartaoVacina) && !"NAO".equalsIgnoreCase(cartaoVacina))
                || (!"SIM".equalsIgnoreCase(sintomasRecentes) && !"NAO".equalsIgnoreCase(sintomasRecentes))
                || (!"SIM".equalsIgnoreCase(contatoComPessoasInfectadas) && !"NAO".equalsIgnoreCase(contatoComPessoasInfectadas))
                || (!"SIM".equalsIgnoreCase(retornandoDeViagem) && !"NAO".equalsIgnoreCase(retornandoDeViagem))) {
            
            System.out.println("Respostas inválidas. Por favor, responda com 'SIM' ou 'NAO'.");
            
            contadorTentativas++;
            
            if (contadorTentativas == 3) {
                System.out.println("Não foi possível realizar o diagnóstico.");
                System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
                System.exit(0);
                scanner.close();
            }
            
            System.out.println("Seu cartão de vacina está em dia? (SIM/NAO)");
            cartaoVacina = scanner.next();
            
            System.out.println("Teve algum dos sintomas recentemente? (SIM/NAO)");
            sintomasRecentes = scanner.next();
            
            System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM/NAO)");
            contatoComPessoasInfectadas = scanner.next();
            
            System.out.println("Está retornando de viagem realizada no exterior? (SIM/NAO)");
            retornandoDeViagem = scanner.next();
        }
        
        double probabilidadeInfeccao = 0;
        
        if ("NAO".equalsIgnoreCase(cartaoVacina)) {
            probabilidadeInfeccao += 10;
        }
        
        if ("SIM".equalsIgnoreCase(sintomasRecentes)) {
            probabilidadeInfeccao += 30;
        }
        
        if ("SIM".equalsIgnoreCase(contatoComPessoasInfectadas)) {
            probabilidadeInfeccao += 30;
        }
        
        if ("SIM".equalsIgnoreCase(retornandoDeViagem)) {
            probabilidadeInfeccao += 30;
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão de vacina em dia? " + cartaoVacina);
        System.out.println("Teve algum dos sintomas recentemente? " + sintomasRecentes);
        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias? " + contatoComPessoasInfectadas);
        System.out.println("Está retornando de viagem realizada no exterior? " + retornandoDeViagem);
        
        System.out.println("Probabilidade de infecção: " + probabilidadeInfeccao + "%");
        
        if (probabilidadeInfeccao >= 50) {
            System.out.println("Você apresenta uma alta probabilidade de estar infectado(a).");
            System.out.println("Recomenda-se procurar ajuda médica imediatamente.");
        } else {
            System.out.println("Você apresenta uma baixa probabilidade de estar infectado(a).");
            System.out.println("Continue mantendo as medidas de prevenção e monitorando sua saúde.");
        }
        
        scanner.close();
    }
}
