package my.edu.tarc.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val ProductList:List<Product>) : RecyclerView.Adapter<ProductAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
          val name: TextView =itemView.findViewById(R.id.TV_name)
          val price: TextView =itemView.findViewById(R.id.tv_Price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val itemView= LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
     val currentProdcut = ProductList[position]
        holder.name.text= currentProdcut.name
        holder.price.text=currentProdcut.price.toString()
    }

    override fun getItemCount(): Int {
       return ProductList.size
    }
}