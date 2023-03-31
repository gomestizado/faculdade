## **Desenvolvimento de projeto de aplicação com uso de vetores de objetos com tratamento de exceções**

O uso de vetores e matrizes de objetos pode facilitar muito o desenvolvimento de determinados projetos, facilitando o desenvolvimento, diminuindo a complexidade e favorecendo a manutenção do sistema.

Dadas as classes a seguir, crie uma superclasse para atender às necessidades das subclasses, com todas as funcionalidades comuns às classes similares. Crie também uma aplicação que gere, por meio de um vetor único com dez objetos de cada tipo, utilizando sempre o construtor vazio. Utilize o tratamento de exceções para proteger a aplicação contra possíveis entradas de dados inválida com os métodos da classe Scanner.

Classes:

| **Classe** | **Atributos**                                                | **Métodos**                                                  |
| :--------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| Aviao      | Prefixo:**Texto**<br />CapacidadeTanque:**inteiro**<br />NumeroPassageiros:**inteiro**<br />Preco:**real**<br />DataRevisao:**Texto** | · Acesso (*setters* e *getters*).<br />· Construtores: pelo menos dois métodos construtores.<br />· *imprimir()*: exibe os dados do objeto.<br />· entrada(): realiza a entrada de dados pelo teclado<br />· *reajustarPreco(percentual : real)*: reajusta o preço do avião, alterando o valor do atributo de acordo com o percentual passado como parâmetro. |
| Navio      | Nome:**Texto**<br />CapacidadeTanque:**inteiro**<br />NumeroPassageiros:**inteiro**<br />NumeroTripulantes:**inteiro**<br />Preco:**real**<br />DataLancamento:**Texto**<br /> | · Acesso (*setters* e *getters*).<br />· Construtores: pelo menos cinco métodos construtores.<br />· *imprimir()*: exibe os dados do objeto.<br />· *entrada()*: realiza a entrada de dados pelo teclado<br />· *passageirosPorTripulantes()*: retorna a divisão do número de passageiros pelo número de tripulantes. Os valores usados nesse método são atributos, por isso não precisam ser passados como parâmetros. |

Observações:

1. A superclasse deverá possuir dois métodos construtores também.
2. Apenas atributos com o mesmo nome e do mesmo tipo podem ser considerados similares para a herança.
3. Os atributos devem ser protegidos contra acesso direto.