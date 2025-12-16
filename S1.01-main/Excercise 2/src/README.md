# Car Class Analysis

This project demonstrates the behavior of `static`, `final`, and `static final` modifiers in Java.

## Class Attributes Analysis

### 1. `brand: static final`
- **Initialization**: Must be initialized at declaration or in static block
- **Modification**: Cannot be modified after initialization (compile-time constant)
- **Scope**: Shared by ALL instances of the class
- **Constructor**: CANNOT be initialized in constructor

### 2. `model: static`
- **Initialization**: Can be initialized at declaration or changed later
- **Modification**: Can be modified at any time
- **Scope**: Shared by ALL instances of the class
- **Constructor**: Can be modified in constructor, but affects all instances

### 3. `power: final`
- **Initialization**: MUST be initialized in constructor (or at declaration)
- **Modification**: Cannot be modified after initialization
- **Scope**: Instance-specific (each object has its own)
- **Constructor**: CAN be initialized in constructor

## Key Findings

### Which attribute can be initialized from the constructor?
- **Only `power`** can be initialized from the constructor.
- `brand` (static final) must be initialized at declaration.
- `model` (static) can be modified but is shared across instances.

### Which attribute cannot be modified ever?
- **`brand`** (static final) cannot be modified after declaration.
- **`power`** (final) cannot be modified after constructor initialization.

### Which attribute affects all instances of the class?
- **Both `brand` and `model`** affect all instances because they are static.
- Changes to `model` are immediately visible to all Car objects.

## Behavior Demonstration

When running the Main class:

1. **Static Method Call**: `Car.brake()` works without object instantiation
2. **Static Variable Behavior**: 
   - Changing `Car.model` affects ALL existing and future Car objects
   - All instances see the same value for static variables
3. **Final Variable Behavior**:
   - Each Car has its own `power` value set at construction
   - This value cannot be changed after object creation
4. **Static Final Variable**:
   - `brand` is constant for all instances
   - Cannot be changed anywhere in the program
