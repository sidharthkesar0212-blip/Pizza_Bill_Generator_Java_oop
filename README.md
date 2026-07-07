# Pizza Bill Generator (Java OOP)

A lightweight, terminal-based Java application that simulates an automated billing system for a pizza shop. The project utilizes foundational **Object-Oriented Programming (OOP)** pillars—such as encapsulation and inheritance—to configure pizzas and dynamically calculate final pricing receipts based on user add-ons.

## 🚀 Features
*   **Base Pizza Selection**: Order standard Custom Pizzas or pre-configured Deluxe Pizzas.
*   **Dynamic Add-ons**: Toggle extra cheese, extra toppings, or takeaway packaging.
*   **Automated Billing**: Generates a clean itemized receipt string mapping individual prices to an aggregated total bill.
*   **Deluxe Packaging**: The `DeluxePizza` subclass overrides behaviors to package premium toppings automatically without redundant charging loops.

## 📂 Project Structure
The repository consists of the following core Java classes:
*   `Main.java` — The execution entry point; orchestrates object instantiation, user workflows, and terminal output display.
*   `Pizza.java` — Base class containing properties for pricing configurations, boolean addition tracking, and custom itemized logic methods.
*   `DeluxePizza.java` — Extends `Pizza` using inheritance to enforce pre-included cheese and toppings configurations directly within its subclass constructor.

## 🛠️ Requirements & Installation
*   Java Development Kit (JDK 8 or higher)
*   Any standard CLI Terminal or Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### How to Run Locally

1. **Clone the repository:**
   ```bash
   git clone https://github.com
   ```

2. **Navigate into the directory:**
   ```bash
   cd Pizza_Bill_Generator_Java_oop
   ```

3. **Compile the source files:**
   ```bash
   javac Main.java Pizza.java DeluxePizza.java
   ```

4. **Execute the application:**
   ```bash
   java Main
   ```

## 📝 Example Output
```text
--- PIZZA BILL ---
Base Pizza: \$10.00
Extra Cheese Added: \$1.50
Extra Toppings Added: \$2.00
Takeaway Packing Added: \$0.50
-------------------
Total Bill: \$14.00
```

## ⚖️ License
This project is open-source and available under the [MIT License](LICENSE).
