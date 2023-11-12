package kz.inspiredsamat.taco.model;

import lombok.Data;

/**
 * @author inspiredsamat
 * @portfolio <a href="https://inspiredsamat.github.io">Personal portfolio</a>
 */

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;
}
