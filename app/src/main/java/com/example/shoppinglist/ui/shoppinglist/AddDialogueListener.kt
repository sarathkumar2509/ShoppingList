package com.example.shoppinglist.ui.shoppinglist

import com.example.shoppinglist.data.db.entity.ShoppingItem

interface AddDialogueListener {

    fun onAddButtonClicked(item : ShoppingItem)
}