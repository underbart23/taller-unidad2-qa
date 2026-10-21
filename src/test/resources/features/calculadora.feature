# language: es
Característica: Operaciones aritméticas en la Calculadora
  Como usuario del sistema de cálculo
  Quiero realizar sumas y operaciones básicas de manera automatizada
  Para asegurar la correcta precisión de los resultados

  Escenario: Suma exitosa de dos números positivos
    Dado que ingreso a la calculadora el primer número 5
    Y ingreso el segundo número 3
    Cuando ejecuto la operación de suma
    Entonces el resultado obtenido debe ser 8

  Esquema del escenario: Validar múltiples operaciones de suma
    Dado que ingreso a la calculadora el número <num1>
    Y ingreso el número <num2>
    Cuando ejecuto la operación de suma
    Entonces el resultado esperado debe ser <resultado>

    Ejemplos:
      | num1 | num2 | resultado |
      | 10   | 20   | 30        |
      | -5   | 5    | 0         |
      | 100  | 200  | 300       |