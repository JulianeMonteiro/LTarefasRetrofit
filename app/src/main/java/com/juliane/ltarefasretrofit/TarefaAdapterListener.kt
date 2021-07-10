package com.juliane.ltarefasretrofit


import com.juliane.ltarefasretrofit.data.model.Tarefa

interface TarefaAdapterListener {
    fun excluirTarefa(tarefa: Tarefa)
}
