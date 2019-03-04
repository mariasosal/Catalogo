package com.example.lenovo.catalogo;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class agregarUsu extends Fragment implements View.OnClickListener {

    private EditText Usua;
    private Button botonReg;


    public agregarUsu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_agregar_usu,container, false);

        Usua=(EditText) vista.findViewById(R.id.ingUsua);
        botonReg=(Button) vista.findViewById(R.id.botonReg);
        botonReg.setOnClickListener(this);

        return vista;

    }

    @Override
    public void onClick(View v) {
        String NuevoUsuario=Usua.getText().toString();

        UsuarioEntity Usuario= new UsuarioEntity();

        Usuario.setUsua(NuevoUsuario);

        Principal.miDatabase.dao().addUsuario(Usuario);

        Toast.makeText(getActivity(),"Usted se ha registrado",Toast.LENGTH_SHORT).show();

    }
}
