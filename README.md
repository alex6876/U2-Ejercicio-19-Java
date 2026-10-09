# ⌚ Simulación de Pulsera Inteligente y Gamificación de Salud (POO en Java)

Este proyecto es una aplicación en Java que modela el seguimiento de actividad física mediante una pulsera inteligente y un perfil de usuario. Pone en práctica el registro acumulativo de metas, el uso de colecciones dinámicas (`ArrayList`) para recompensas y el control de banderas booleanas para evitar duplicación de logros en memoria.

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema está organizado en 3 clases principales:

*   **`PerfilUsuario`**: Representa al usuario y su historial de logros.
    *   **Atributos:** `nombre`, `pasosAcumulados` (inicializado en `0`) y una lista dinámica `ArrayList<String>` llamada `insigniasObtenidas`.
    *   **Métodos:** `otorgarInsignia(String nombreInsignia)`, agrega la insignia a la colección e informa la obtención por consola.
*   **`PulseraInteligente`**: Representa el dispositivo de monitoreo físico.
    *   **Atributos:** Mantiene la referencia al `PerfilUsuario`, define la `metaDiaria` ($10000$ pasos) y usa una bandera booleana `insigniaEntregada`.
    *   **Métodos:** `registrarPasos(int cantidad)`, valida que el incremento sea positivo, actualiza el acumulado del usuario y evalúa si corresponde otorgar la insignia por alcanzar la meta.
*   **`Main`**: Punto de entrada del programa. Instancia el usuario y la pulsera, realiza tres registros de pasos acumulativos que superan la meta diaria y muestra el resumen final por consola.

---

## ⚙️ Reglas de Negocio y Control de Flujo

El sistema aplica las siguientes validaciones y controles en tiempo de ejecución:

1. **Validación de Entradas:** Si se intenta registrar una cantidad de pasos menor o igual a cero (`cantidad <= 0`), se rechaza la operación e interrumpe la ejecución del método mediante `return`.
2. **Acumulación Progresiva:** Cada registro incrementa el atributo `pasosAcumulados` del objeto `PerfilUsuario`.
3. **Control de Logro Único (Bandera / Flag):** Al alcanzar o superar la `metaDiaria` ($10000$ pasos), la pulsera verifica que `!insigniaEntregada`. Al otorgar la insignia, cambia la bandera a `true`, asegurando que registros de pasos posteriores no entreguen insignias duplicadas.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente desglose por pantalla:

```text
Pasos registrados: 4000
Pasos acumulados: 4000
Pasos registrados: 3500
Pasos acumulados: 7500
Pasos registrados: 3000
Pasos acumulados: 10500
¡Insignia obtenida: Meta diaria alcanzada!
--------------------
Nombre: Juan
Total de pasos: 10500
Insignias obtenidas: [Meta diaria alcanzada]
