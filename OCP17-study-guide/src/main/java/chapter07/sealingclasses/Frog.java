package chapter07.sealingclasses;

//public class sealed Frog permits GlassFrog {} // DOES NOT COMPILE
// The first example does not compile because the class and sealed modifiers are in the wrong order.
public sealed class Frog permits GlassFrog {
}

