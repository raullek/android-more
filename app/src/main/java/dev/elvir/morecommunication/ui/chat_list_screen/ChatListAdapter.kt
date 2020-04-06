package dev.elvir.morecommunication.ui.chat_list_screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.elvir.morecommunication.R
import dev.elvir.morecommunication.data.entity.user.UserEntity

class ChatListAdapter(
    val listUser: MutableList<UserEntity>
) : RecyclerView.Adapter<ChatListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder =
        ChatListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_chat_list, parent, false)
        )

    override fun getItemCount(): Int = listUser.size

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        holder.userName.text = listUser[position].userName
    }

}