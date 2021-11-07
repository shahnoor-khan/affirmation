package com.example.affirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.R
import com.example.affirmation.model.affirmation

/**
 * adapter for the[recyclerview] in [MainActivity].
 */
class ItemAdapter (private val dataset: List<affirmation>,
                   private val context:Context):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{
    //provide a reference to the views for each data item
    //complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    //each data item is just an affirmation object.

    class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view){
        val textView:TextView = view.findViewById(R.id.item_title)
        val imageView:ImageView=view.findViewById(R.id.item_image)
    }
    /**
     * create new views (invoked by the layout manager )
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
    return ItemViewHolder(adapterLayout)
    }

    /**
     * return the content of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringresourceid)
        holder.imageView.setImageResource(item.imagerResourceId)
    }

    /**
     * return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}