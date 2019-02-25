package ramirez.eduardo.contacto

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_editar_contacto.*

class EditarContactoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_contacto)
        val nombre: String = intent.getStringExtra("nombre")
        val telefono: String = intent.getStringExtra("telefono")
        val correo: String = intent.getStringExtra("correo")
        campo_nombre.setText(nombre)
        campo_correo.setText(correo)
        campo_telefono.setText(telefono)
    }
    fun aceptar(v: View){
        val resultIntent = Intent()
        resultIntent.putExtra("nombre", campo_nombre.text.toString())
        resultIntent.putExtra("correo", campo_correo.text.toString())
        resultIntent.putExtra("telefono", campo_telefono.text.toString())
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }

    fun cancelar(v: View){

        finish()
    }

}
