## Key Rules

- **No Constructor Inheritance**: Constructors belong strictly to the class that defines them and are never inherited. You must declare a new one for the child class.
<br><br>
- **`super()` Order**: The call to `super()` must be the absolute first statement inside your child constructor.
  <br><br>
- **Execution Order**: When creating a child object, the parent constructor always executes first, followed by the child constructor.
---
## `super`  or `super()` keyword:
- The super keyword in Java is a reference variable used inside a subclass to directly refer to its immediate parent (superclass) object.