# KotlinMVVMtest
Example of Android multiway data binding in Kotlin

This is as simple as possible project showing how to configure project to run data binding. 
It includes:
- gradle configuration
- model to view binding
- view to model binding
- implementation of Observable in Kotlin, signle property binding
- handlers binding

# What I was unable to do:
It seems impossible (at least for me) to implement databinding using kotlin Delegated property, what should be much 
more elegant. So for now simple overriden setter is used as @Bindable annotation is not allowed to be used on delegated 
properties.
