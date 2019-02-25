package ramirez.eduardo.contacto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_editar_contacto.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEditar.setOnClickListener {
            val intent = Intent(this, EditarContactoActivity::class.java)
            intent.putExtra("nombre", txt_nombre.text)
            intent.putExtra("correo", txt_correo.text)
            intent.putExtra("telefono", txt_telefono.text)
            startActivityForResult(intent, 123)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data!=null){
            val nombre: String = data.getStringExtra("nombre")
            val telefono: String = data.getStringExtra("telefono")
            val correo: String = data.getStringExtra("correo")
            txt_nombre.setText(nombre)
            txt_telefono.setText(telefono)
            txt_correo.setText(correo)
        }

    }
}
