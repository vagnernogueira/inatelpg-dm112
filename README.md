# inatelpg-dm112

Avaliações da disciplina DM112


Projeto implementado em Java 17 com maven utilizando spring-boot 3.4.4
 

Módulos maven: dm112-email e dm112-logistica


Exemplo de requisição de teste


GET: http://localhost:8080/api/consultarPedidos


POST: http://localhost:8080/api/registrarEntrega

{
	"idPedido": 10,
	"cpfRecebedor": "11122233344",
	"dtEntrega": "21/03/2025"
}


POST: http://localhost:8080/mailapi/enviar

{
"para": "vagner.nogueira@gmail.com",
"assunto": "teste com mailtrap",
"texto": "Isto é apenas um teste com o mailtrap"
}
