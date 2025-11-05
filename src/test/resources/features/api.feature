Feature: Pruebas de API
  Verificar el endpoint /users
  
  @P123-6
  Scenario: Obtener usuario por ID
    Given la API está disponible
    When hago una petición GET a "/users/1"
    Then el código de respuesta debe ser 200
    And el campo "id" debe ser 1
    And el campo "name" debe ser "Leanne Graham"

  @P123-23
  Scenario: Obtener comentario por ID
    Given la API está disponible
    When hago una petición GET a "/comments/1"
    Then el código de respuesta debe ser 200
    And el campo "id" debe ser 1
    And el campo "email" debe ser "Eliseo@gardner.biz"