# Topic: tructural Design Patterns
****
##### Student: Pavlov Alexandru
##### Group: FAF-181
****
## Objectives
****
1. Study about **Structural Design Patterns**
2. Expand previous lab and include at least 3 structural design patterns
## Theory
****
In software engineering, **Design patterns** are typical solutions to common problems in software design. Each pattern is like a blueprint that can be customized to solve a particular design problem.They define a common language that helps developer teams communicate more efficiently.

**Design patterns** are concerned with how classes and objects are composed to form larger structures. Structural class patterns use inheritance to create a hierarchy of classes/abstractions, but the structural object patterns use composition which is generally a more flexible alternative to inheritance.

The most known design patterns include:
 * **Adapter**
 * **Bridge**
 * **Composite**
 * **Decorator**
 * **Facade**
 * **Lightweight**
 * **Proxy**

## Implemetation
****
Previous lab was expanded, and thre structural design patterns were implemented(**Decorator**, **Adapter**, **Facade**), with the objects of type Cookware(Pan, Pot, Casserole) and object of type Stove(Antique stove, Gas stove, electrical stove). Cookware received a new attribute(4 in total), getters and setters, and toString() method used for output, while Stove has same methods, and 3 attributes.

For the **Adapter**, **StoveAdapter** class was implemented using composition
```java
public class StoveAdapter extends AdapterUtility{
    private final IStove stove;

    public StoveAdapter(IStove stove) {
        this.stove = stove;
    }
```
To test the results, a new class was made - **Kitchen** with the method **assembleKitchen()** which now can get parameters of both Cookware and Stove types, afterwards printing them on screen
```java
void assembleKitchen(ICookware... cookwares) {
        System.out.println("Kitchen contains following cookware");
        for (ICookware cookware : cookwares) {
            System.out.println(cookware.toString());
        }
    }
```

**Facade** allows programmers to hide complex processes of creating and customizing objects. For this, I have created **Custom cookware** class, which allow to change the volume and material type used when creating the objects. 

```java
public ICookware getCustomCookware(String type, float volume, String materialType) {
        BaseCookwareFactoryDecorator customizer = new CustomVolume(volume, baseFactory);
        ICookware customCookware = customizer.createCookware(type);
        customCookware.setMaterialType(materialType);
        return customCookware;
    }
```

**Decorator** allows us to attach new behaviors by placing them in so called wrappers that contains these behaviors. For the scope of this lab work, **BaseCookwareFactoryDecorator** class was implemented. With its help, the Cookware class was expanded with a new attribute - volume, and a new method inside **CustomVolume** which can be used to make custom cookware objects. By default all of object have a volume of 2 liters.

## Program output
![output](https://github.com/Sdude225/TMPS/blob/main/images/output.png)
## Program Hierarchy
![structure](https://github.com/Sdude225/TMPS/blob/main/images/structure.png)
