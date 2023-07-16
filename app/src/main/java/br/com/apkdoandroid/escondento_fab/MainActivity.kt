package br.com.apkdoandroid.escondento_fab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.apkdoandroid.escondento_fab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        layoutManager = LinearLayoutManager(this)

        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = ItemAdater()

        binding.recyclerView.addOnScrollListener( object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy) //horizontal = dy , vertical = dx

                var primeiroItemVisivel = layoutManager.findFirstVisibleItemPosition()
                var ultimoVisivel = layoutManager.findLastVisibleItemPosition()
                var totalItens = binding.recyclerView.adapter?.itemCount


                if(primeiroItemVisivel != null && totalItens != null && ultimoVisivel != null ){
                    //primeiro visivel
                   /* if(primeiroItemVisivel > 0){
                        binding.floatingActionButton.hide()
                    }else{
                        binding.floatingActionButton.show()
                    }*/

                    // no ultimo item
                  /*  if(totalItens - 1 == ultimoVisivel){
                        binding.floatingActionButton.hide()
                    }else{
                        binding.floatingActionButton.show()
                    }*/

                    // rolagem vertical
                    if(dy > 0){
                        binding.floatingActionButton.hide()
                    }else{
                        binding.floatingActionButton.show()
                    }

                }

            }
        })
    }
}