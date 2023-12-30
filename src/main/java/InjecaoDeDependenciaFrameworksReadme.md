/*
# os 2 passos seguintes sao essenciais para que o framework faça a injecao de dependencia:
- passo 1: registrar os componentes
- passo 2: indicar quais componentes dependem de quais.

obs após fazer os passos acima, o proprio framework se encarrega de:
- instanciar componentes
- resolver dependencias
- reaproveitar componentes
- gerenciar escopo e ciclo de vida dos componentes.

obs. lembrando que a injecao de dependencia pode ser feita atraves:
- construtor
- metodo set
- container de injecao de dependencia (framework). (que é o que usamos aqui nesse exemplo, é o spring que faz essa injecao de dependencia).

obs. na aula, o professor nelio explica que os componentes entities, e services foram colocados dentro da pasta errada.
ou seja era para eles estarem dentro da pasta com.devsuperior.aula 
mas eles durante a gravacao do video ficaram espalhados. 
entao para resolver podemos realocar da forma correta os componentes dentro da pasta com.devsuperior.aula que foi o que eu fiz
ou entao temos que dentro da classe AulaApplication temos que colocar um annotation chamado
@ComponentScan({"com.devsuperior"}) para indicar ao spring que é desse pacote que ele deve considerar como pacote principal.

*/