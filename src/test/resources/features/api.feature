Feature: Pruebas de API

  Scenario: Obtener usuario por ID
    Given la API está disponible
    When hago una petición GET a "/users/1"
    Then el código de respuesta debe ser 200
    And el campo "id" debe ser 1
    And el campo "name" debe ser "Raúl Torres"
