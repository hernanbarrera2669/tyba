#language:es

Característica: Realizar el proceso de compras en el portal web de “AdvantageDemo”
  Como cliente de “AdvantageDemo”
  Deseo realizar el proceso de compras de un producto
  Para verificar su correcto funcionamiento


  @Registrousuario
  Escenario:Verificar que se realice el proceso de registro para un nuevo usuario
    Dado que el usuario ingresa al portal web de AdvantageDemo
    Cuando ingrese a la opcion usuario para crear nueva cuenta con los datos
      | username | email                | password  | confirm_password | name   | last_name | country  | city     |
      | HernanB  | hernan2669@gmail.com | Test1986* | Test1986*        | Hernan | Barrera   | Colombia | Medellin |
  #  Entonces el usuario vizualizara su nombre en la pantalla principal