package br.com.apkdoandroid.escondento_fab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.apkdoandroid.escondento_fab.databinding.ItemBinding

class ItemAdater : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflat = LayoutInflater.from(parent.context)
        return  ItemViewHolder(ItemBinding.inflate(inflat,parent,false))
    }

    override fun getItemCount(): Int {
        return 30
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       holder.bind()
    }
}