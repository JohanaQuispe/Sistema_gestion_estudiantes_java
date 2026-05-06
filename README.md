# 🎓 Sistema de Gestión de Estudiantes
 
Sistema de gestión académica desarrollado en **Java** que permite administrar la información de estudiantes de manera eficiente mediante una interfaz de consola.
 
---
 
## 📋 Descripción
 
El **Sistema de Gestión de Estudiantes** es una aplicación de escritorio desarrollada con el paradigma de **Programación Orientada a Objetos (POO)** en Java. Permite realizar las operaciones esenciales de administración estudiantil: registrar, consultar, actualizar y eliminar información de estudiantes.
 
---
 
## ✨ Funcionalidades
 
- ➕ **Registrar estudiantes** — Agregar nuevos estudiantes con sus datos personales y académicos.
- 📋 **Listar estudiantes** — Visualizar todos los estudiantes registrados en el sistema.
- 🔍 **Buscar estudiante** — Consultar la información de un estudiante específico por nombre o ID.
- ✏️ **Actualizar datos** — Modificar la información de un estudiante existente.
- ❌ **Eliminar estudiante** — Remover el registro de un estudiante del sistema.
---
 
## 🛠️ Tecnologías utilizadas
 
| Tecnología | Descripción |
|------------|-------------|
| Java | Lenguaje principal de desarrollo |
| POO | Paradigma de programación orientada a objetos |
| NetBeans / IntelliJ IDEA | IDE recomendado para el proyecto |
 
---
 
## 📁 Estructura del proyecto
 
```
Sistema_gestion_estudiantes_java/
└── SISTEMA_GESTION/
    └── src/
        └── sistema_gestion/
            ├── Estudiante.java       # Clase modelo del estudiante
            ├── GestionEstudiantes.java  # Lógica de negocio (CRUD)
            └── SistemaGestion.java   # Clase principal (main)
```
 
---
 
## 🚀 Requisitos previos
 
Antes de ejecutar el proyecto, asegúrate de tener instalado:
 
- **Java JDK 8** o superior → [Descargar JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Un IDE como **NetBeans**, **IntelliJ IDEA** o **Eclipse** (opcional)
Verifica tu instalación de Java con:
 
```bash
java -version
```
 
---
 
## ▶️ Cómo ejecutar el proyecto
 
### Opción 1 — Desde un IDE (recomendado)
 
1. Clona el repositorio:
   ```bash
   git clone https://github.com/JohanaQuispe/Sistema_gestion_estudiantes_java.git
   ```
2. Abre el IDE de tu preferencia.
3. Importa el proyecto desde la carpeta `SISTEMA_GESTION`.
4. Ejecuta la clase principal `SistemaGestion.java`.
### Opción 2 — Desde la terminal
 
```bash
# 1. Clona el repositorio
git clone https://github.com/JohanaQuispe/Sistema_gestion_estudiantes_java.git
 
# 2. Navega a la carpeta del proyecto
cd Sistema_gestion_estudiantes_java/SISTEMA_GESTION
 
# 3. Compila los archivos Java
javac -d bin src/sistema_gestion/*.java
 
# 4. Ejecuta la aplicación
java -cp bin sistema_gestion.SistemaGestion
```
 
---
 
## 💡 Conceptos aplicados
 
- ✅ Encapsulamiento (getters y setters)
- ✅ Clases y objetos
- ✅ Colecciones (`ArrayList`)
- ✅ Manejo de excepciones
- ✅ Menú interactivo con `Scanner`
---
 
## 👩‍💻 Autora
 
**Johana Quispe**
- GitHub: [@JohanaQuispe](https://github.com/JohanaQuispe)
---
 
## 📄 Licencia
 
Este proyecto es de uso libre con fines educativos.
