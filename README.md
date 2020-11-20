# Padrao-de-Projeto-Strategy
Programa que permite variação de desconto em produtos usando padrão Strategy GOF :iphone:

Atividade proposta pelo Prof. Adilson Vahldick - Universidade do Estado de Santa Catarina - UDESC

Intenção: definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o alforitmo varie independentemente dos clientes que o utilizam.

Aplicabilidade - Use o padrão Strategy quando:
- Muitas classes relacionadas diferem somente no seu comportamento. As estratégias fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos.
- Você necessita de variantes de um algoritmo. Por exemplo, pode definir algoritimos que refletem diferentes soluções de compromisso entre espaço / tempo. As estratégias podem ser usadas quando essas variantes são implementadas como uma hierarquia de classes de algoritmos.
- Um algoritmo usa dados dos quais os clientes não deveriam ter conhecimento. Use padrão Strategy para evitar a exposição das estruturas de dados complexas, específicas do algoritmo
- Uma classe define muitos comportamentos, e estes aparecem em suas operações como múltiplos comandos condicionais da linguagem. Em vez de usar muitos comandos condicionais, mova os ramos condicionais relacionados para a sua própria classe Strategy.

#### Estrutura

![Estrutura Strategy](https://github.com/camimassaneiro/Padrao-de-Projeto-Strategy/blob/master/Estrutura%20strategy.PNG)

Participantess:
- Strategy: define uma interface comum para todos os algoritmos suportados. Context usa esta interface para chamar o algoritmo definido por uma ConcreteStrategy.
- ConcreteStrategy: implementa o algoritmo usando a interface de Strategy.
- Context:
	- é configurado com um objeto ConcreteStrategy;
	- mantém uma referência para um objeto Strategy;
	- pode definir uma interface que permite a Strategy acessar seus dados.

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
