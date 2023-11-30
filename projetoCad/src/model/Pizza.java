/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author david
 */
 public class Pizza {
        private String Sabor;
        private double preco;

        public Pizza(String Sabor, double preco) {
            this.Sabor = Sabor;
            this.preco = preco;
        }

        public String getSabor() {
            return Sabor;
        }

        public double getPreco() {
            return preco;
        }
    }

