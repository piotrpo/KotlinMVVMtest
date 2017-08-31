package pl.com.digita.kotlinmvvmtest

import android.databinding.BaseObservable
import android.databinding.Bindable

class UserEntity(firstName: String, lastName: String) : BaseObservable() {

    @Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstName)
        }


    @Bindable
    var lastName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.lastName)
        }

    init {
        this.firstName = firstName
        this.lastName = lastName
    }
}