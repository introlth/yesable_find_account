package com.example.yesable

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class Find_Gid_Activity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_find_gid, container, false)


        // 아이디 찾기 버튼 설정
        val findIdButton: Button = view.findViewById(R.id.find_id_button)
        findIdButton.setOnClickListener {
            val isInputValid = validateInput()

            if (isInputValid) {
                val intent = Intent(requireActivity(), Find_Id_Finish_Activity::class.java)
                startActivity(intent)
            } else {
                showErrorPopup()
            }
        }

        return view
    }

    // 입력값을 검증하는 함수
    private fun validateInput(): Boolean {
        // 실제 로직에서는 입력값을 가져와서 확인해야 합니다.
        return false // 예제로는 항상 오류가 발생하도록 합니다.
    }

    // 오류 팝업을 표시하는 함수
    private fun showErrorPopup() {
        val dialogView = LayoutInflater.from(requireActivity())
            .inflate(R.layout.activity_find_id_error_popup, null)
        val alertDialog = AlertDialog.Builder(requireActivity())
            .setView(dialogView)
            .create()

        val errorButton: Button = dialogView.findViewById(R.id.dialog_button)
        errorButton.setOnClickListener {
            alertDialog.dismiss()
        }

        alertDialog.show()
    }
}