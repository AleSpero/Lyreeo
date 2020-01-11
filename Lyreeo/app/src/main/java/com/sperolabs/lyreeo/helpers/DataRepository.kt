package com.sperolabs.lyreeo.helpers

import android.content.Context
import io.realm.Realm
import io.realm.RealmObject

internal object DataRepository {

    private var realm : Realm? = null

    fun init(context : Context){
       Realm.init(context)
        realm = Realm.getDefaultInstance()
    }

    inline fun <reified T : RealmObject> get(vararg params : Pair<String, Any>) : T?{
        assert(realm != null)
        //TODO params
        return realm!!.where(T::class.java)
            .findFirst()
    }

}