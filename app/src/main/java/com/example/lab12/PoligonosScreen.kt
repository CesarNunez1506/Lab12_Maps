package com.example.lab12

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Polygon
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun PoligonosScreen() {
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(LatLng(-16.430000, -71.510000), 15f)
    }

    val mallAventuraPolygon = listOf(
        LatLng(-16.432292, -71.509145),
        LatLng(-16.432757, -71.509626),
        LatLng(-16.433013, -71.509310),
        LatLng(-16.432566, -71.508853)
    )


    val parqueLambramaniPolygon = listOf(
        LatLng(-16.422704, -71.530830),
        LatLng(-16.422920, -71.531340),
        LatLng(-16.423264, -71.531110),
        LatLng(-16.423050, -71.530600)
    )

    val plazaDeArmasPolygon = listOf(
        LatLng(-16.398866, -71.536961),
        LatLng(-16.398744, -71.536529),
        LatLng(-16.399178, -71.536289),
        LatLng(-16.399299, -71.536721)
    )


    GoogleMap(cameraPositionState = cameraPositionState) {
        Polygon(
            points = plazaDeArmasPolygon,
            strokeColor = Color.Red,
            fillColor = Color.Blue,
            strokeWidth = 5f
        )
        Polygon(
            points = parqueLambramaniPolygon,
            strokeColor = Color.Red,
            fillColor = Color.Blue,
            strokeWidth = 5f
        )
        Polygon(
            points = mallAventuraPolygon,
            strokeColor = Color.Red,
            fillColor = Color.Blue,
            strokeWidth = 5f
        )

    }
}