
package chapter01.understanding_package_declarations_and_imports.structure; // package must be first non-comment

// import must come after package

import java.util.*;

import java.text.NumberFormat;

import java.util.*;
// package chapter01.understanding_package_declarations_and_imports.structure;  // DOES NOT COMPILE

// String name; // DOES NOT COMPILE

public class Meerkat {
    double weight; // fields and methods can go in either order

    public double getWeight() {
        return weight;
    }

    double height; // another field - they don't need to be together
}
